package com.design.creational.builder;

public class GymPackage {
	public final String machines;
	public final String fee;
	public final String trainer;
	public final String nutriotion;
	public final String zumba;
	
	private GymPackage(GymPackageBuilder builder) {
		this.machines=builder.machines;
		this.fee= builder.fee;
		this.trainer= builder.trainer;
		this.nutriotion= builder.nutriotion;
		this.zumba= builder.zumba;				
	}
	
	public String getMachines() {
		return machines;
	}
	public String getFee() {
		return fee;
	}

	public String getTrainer() {
		return trainer;
	}

	public String getNutriotion() {
		return nutriotion;
	}

	public String getZumba() {
		return zumba;
	}

	public static class GymPackageBuilder{
		public final String machines;
		public final String fee;
		public String trainer;
		public String nutriotion;
		public String zumba;
		
		public GymPackageBuilder(String machines, String fee) {
			this.machines=machines;
			this.fee=fee;
		}
		
		public GymPackageBuilder trainer(String trainer) {
			this.trainer= trainer;
			return this;
		}
		
		public GymPackageBuilder nutriotion(String nutriotion) {
			this.nutriotion= nutriotion;
			return this;
		}
		
		public GymPackageBuilder zumba(String zumba) {
			this.zumba= zumba;
			return this;
		}

		
		public GymPackage build() {
			GymPackage pack= new GymPackage(this);
			validateGymPackage(pack);
			return pack;
			
		}

		private void validateGymPackage(GymPackage pack) {
			// Validate the GYM Package //			
		}
	}
}
