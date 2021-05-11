const app = Vue.createApp({
    data() {
      return {
          userInput: ''
      };
    },
    methods: {
        showAlert() {
            alert("This works!");
        },
        saveInput(event) {
            this.userInput = event.target.value;
        }
    }
});

app.mount('assignment');