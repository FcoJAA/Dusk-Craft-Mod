// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelfungusModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fungusmodel"), "main");
	private final ModelPart cuerpo;
	private final ModelPart pieL;
	private final ModelPart pieR;
	private final ModelPart cabeza;

	public ModelfungusModel(ModelPart root) {
		this.cuerpo = root.getChild("cuerpo");
		this.pieL = root.getChild("pieL");
		this.pieR = root.getChild("pieR");
		this.cabeza = root.getChild("cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition cuerpo = partdefinition.addOrReplaceChild("cuerpo",
				CubeListBuilder.create().texOffs(21, 21)
						.addBox(1.0F, -9.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 21)
						.addBox(2.0F, -8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 21)
						.addBox(-1.0F, -7.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(1.0F, -6.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 14)
						.addBox(-3.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 5)
						.addBox(-1.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, -9.0F, -1.0F, 4.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-1.0F, -12.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(0.0F, -14.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pieL = partdefinition.addOrReplaceChild("pieL", CubeListBuilder.create().texOffs(0, 0).addBox(
				-0.5F, -0.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.5F, 19.0F, 0.5F));

		PartDefinition pieR = partdefinition.addOrReplaceChild("pieR", CubeListBuilder.create().texOffs(14, 18)
				.addBox(-0.5F, -0.25F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.5F, 19.0F, 0.5F));

		PartDefinition cabeza = partdefinition.addOrReplaceChild("cabeza",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.5F, -2.0F, -3.5F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-2.5F, -4.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.5F, -3.0F, -2.5F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 8)
						.addBox(-2.5F, -1.0F, -1.5F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 10.0F, 0.5F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		cuerpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pieL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		pieR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cabeza.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.pieR.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.pieL.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.cabeza.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.cabeza.xRot = headPitch / (180F / (float) Math.PI);
	}
}