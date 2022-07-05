package net.mcreator.duskcarft.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelwendigoMob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("duskcarft", "modelwendigo_mob"), "main");
	public final ModelPart piernaR;
	public final ModelPart piernaL;
	public final ModelPart cuerpo;
	public final ModelPart armR;
	public final ModelPart armL;
	public final ModelPart cabeza;

	public ModelwendigoMob(ModelPart root) {
		this.piernaR = root.getChild("piernaR");
		this.piernaL = root.getChild("piernaL");
		this.cuerpo = root.getChild("cuerpo");
		this.armR = root.getChild("armR");
		this.armL = root.getChild("armL");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition piernaR = partdefinition.addOrReplaceChild("piernaR",
				CubeListBuilder.create().texOffs(29, 39).addBox(-1.0F, 16.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 39)
						.addBox(0.0F, 16.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 39)
						.addBox(-3.0F, 16.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 36)
						.addBox(-2.0F, 11.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 3.0F, 0.0F));
		PartDefinition piernaL = partdefinition.addOrReplaceChild("piernaL",
				CubeListBuilder.create().texOffs(18, 39).addBox(-1.0F, 16.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 39)
						.addBox(0.0F, 16.0F, 1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 39)
						.addBox(2.0F, 16.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 20)
						.addBox(0.0F, 11.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.0F, 3.0F, 0.0F));
		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(42, 23).addBox(1.0F, -33.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 22)
						.addBox(1.0F, -31.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(19, 0)
						.addBox(-4.0F, -33.0F, 2.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -37.0F, 2.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(4.0F, -33.0F, -1.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(-4.0F, -29.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(-3.0F, -27.0F, 2.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(3.0F, -27.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 18)
						.addBox(1.0F, -26.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 38)
						.addBox(-3.0F, -27.0F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 31)
						.addBox(-4.0F, -33.0F, -1.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 10)
						.addBox(-1.0F, -24.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-3.0F, -26.0F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-4.0F, -31.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
						.addBox(2.0F, -29.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 24)
						.addBox(-4.0F, -33.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-3.0F, -23.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition armR = partdefinition.addOrReplaceChild("armR",
				CubeListBuilder.create().texOffs(38, 8).addBox(-3.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 39)
						.addBox(-3.0F, 14.0F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 12)
						.addBox(-4.0F, 0.0F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 13)
						.addBox(-5.0F, 15.0F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 28)
						.addBox(-5.0F, 5.0F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 20)
						.addBox(-5.0F, 10.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-2.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -7.0F, 2.5F));
		PartDefinition armL = partdefinition.addOrReplaceChild("armL",
				CubeListBuilder.create().texOffs(34, 27).addBox(4.0F, 15.0F, -1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 26)
						.addBox(0.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 12)
						.addBox(0.0F, 0.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 31)
						.addBox(2.0F, 0.0F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(33, 39)
						.addBox(2.0F, 15.0F, 0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 18)
						.addBox(3.0F, 10.0F, -1.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 26)
						.addBox(3.0F, 5.0F, -0.5F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(4.0F, -7.0F, 2.5F));
		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -7.0F, -5.5F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(14, 20)
						.addBox(-7.0F, -7.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 34)
						.addBox(-5.0F, -7.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
						.addBox(7.0F, -15.0F, -2.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 27)
						.addBox(-8.0F, -16.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 0)
						.addBox(4.0F, -7.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-6.0F, -12.0F, 0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 18)
						.addBox(-8.0F, -10.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 20)
						.addBox(4.0F, -7.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 39)
						.addBox(5.0F, -12.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 4)
						.addBox(3.0F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 10)
						.addBox(6.0F, -9.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 38)
						.addBox(-4.0F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-1.0F, 2.0F, -6.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 7)
						.addBox(-2.0F, -1.0F, -6.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -13.0F, 2.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		piernaR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		piernaL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		armL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.piernaR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.piernaL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.armR.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.cabeza.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cabeza.xRot = headPitch / (180F / (float) Math.PI);
		this.armL.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
