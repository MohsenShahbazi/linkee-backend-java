package ir.pt.diktee.resource.enums;
public enum GENDER {
    Male(1) {
        @Override
        public String getTitle() {
            return "مرد";
        }
    },
    Female (2) {
        @Override
        public String getTitle() {
            return "زن";
        }
    },
    GENDERLESS (3) {
        @Override
        public String getTitle() {
            return "نامشخص";
        }
    };

    private final int value;

    GENDER(int value) {
        this.value = value;
    }

    public abstract String getTitle();

    public int getValue() {
        return this.value;
    }
}
