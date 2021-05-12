const app = Vue.createApp({
    data() {
        return {
            friends: [
                {
                    id: 'manuel',
                    name: 'Manuel Lorenz',
                    phone: '1234',
                    email: 'test@gmail.com'
                },
                {
                    id: 'julie',
                    name: 'Julie Jones',
                    phone: '1234123',
                    email: 'test2@gmail.com'
                },
            ]
        }
    }

});
app.mount('#app');