var database = new Vue({
        el: '#database',
        data: {
            databaseConfiguration: {
                type: '',
                url: '',
                port: '',
                username: '',
                password: ''
            },
            errors: []
        },
        created: function () {
            axios.get('/config/database')
                .then(function (response) {
                    this.databaseConfiguration = response.data;
                    console.log(response.data);
                })
                .catch(function (error) {
                    this.errors.push(error);
                    console.log(error);
                })
        }

    }
)





