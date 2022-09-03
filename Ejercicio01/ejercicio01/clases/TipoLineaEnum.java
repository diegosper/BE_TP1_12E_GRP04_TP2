package ejercicio01.clases;

public enum TipoLineaEnum {
	
	CELULAR {
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Celular";
		}
	},
	
	FIJO{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Fijo";
		}
	},
	FAX{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Fax";
		}
	}

	
}
