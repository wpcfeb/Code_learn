const app = Vue.createApp({
    data() {
        return {
            name: "Peace",
            age: 23,
            img_src: "https://picsum.photos/200"
        }
    },
    methods: {
        calculateAge() {
            return this.age + 5;
        },
        calculateRandom() {
            return Math.random()
        }
    }
});
app.mount("#assignment")
