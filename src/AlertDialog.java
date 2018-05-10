public class AlertDialog {
    private Contex contex;
    private String title;
    private String message;

    private AlertDialog() { }

    private AlertDialog(Builder builder) {
        contex = builder.contex;
        title = builder.title;
        message = builder.message;
    }

    public void show(){ }

    static class Builder {
        private Contex contex;
        private String title;
        private String message;

        public Builder(Contex contex) {
            this.contex = contex;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public AlertDialog create(){
            return new AlertDialog(this);
        }

        public void show(){
            create();
            //langsung menampilkan dialog
        }
    }
}
