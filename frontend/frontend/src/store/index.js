import Vue from 'vue'
import Vuex from 'vuex'
import axios from 'axios'

Vue.use(Vuex)

export const store = new Vuex.Store({
    state : {
            id : '',
            modelName : '',
            sort : '',
            price: '',
            brand : '',
            gear : '',
            rent: ''
            
    },
    mutations: {

    },
    getters: {

    },
    actions: {

    }
})