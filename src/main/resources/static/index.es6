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
        },
    methods: {
        saveDatabaseConfig: function (event) {
            axios.put('/config/database', this.databaseConfiguration)
                .then(response => {
                    console.log(response);
                })
                .catch(error => {
                    console.log(error);
                })
        }
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
        },
    methods: {
        saveNetworkConfig: function (event) {
            axios.put('/config/network', this.networkConfiguration)
                .then(response => {
                    console.log(response);
                })
                .catch(error => {
                    console.log(error);
                })
        }
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
        },
    methods: {
        saveModuleConfig: function (event) {
            axios.put('/config/module', this.moduleConfiguration)
                .then(response => {
                    console.log(response);
                })
                .catch(error => {
                    console.log(error);
                })
        }
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
        },
    methods: {
        saveRuntimeApplicationConfig: function (event) {
            axios.put('/config/application', this.runtimeApplicationConfiguration)
                .then(response => {
                    console.log(response);
                })
                .catch(error => {
                    console.log(error);
                })
        }
    }

    }
)





