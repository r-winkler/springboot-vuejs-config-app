let databaseConfig = new Vue({
        el: '#database',
        data: {
            databaseConfiguration: {}
        },
        created: function () {
            axios.get('/config/database')
                .then(response => {
                    this.databaseConfiguration = response.data;
                    console.log(response.data);
                })
                .catch(error => {
                    console.log(error);
                })
        }
    }
)

let networkConfig = new Vue({
        el: '#network',
        data: {
            networkConfiguration: {}
        },
        created: function () {
            axios.get('/config/network')
                .then(response => {
                    this.networkConfiguration = response.data;
                    console.log(response.data);
                })
                .catch(error => {
                    console.log(error);
                })
        }
    }
)

let moduleConfig = new Vue({
        el: '#module',
        data: {
            moduleConfiguration: {}
        },
        created: function () {
            axios.get('/config/module')
                .then(response => {
                    this.moduleConfiguration = response.data;
                    console.log(response.data);
                })
                .catch(error => {
                    console.log(error);
                })
        }
    }
)

let runtimeApplicationConfig = new Vue({
        el: '#runtimeApplication',
        data: {
            runtimeApplicationConfiguration: {}
        },
        created: function () {
            axios.get('/config/application')
                .then(response => {
                    this.runtimeApplicationConfiguration = response.data;
                    console.log(response.data);
                })
                .catch(error => {
                    console.log(error);
                })
        }
    }
)





