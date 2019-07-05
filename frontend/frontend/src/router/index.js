import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import CycleAdd from '@/components/cycle/CycleAdd'
import CycleList from '@/components/cycle/CycleList'
import CycleModify from '@/components/cycle/CycleModify'
import CycleDetail from '@/components/cycle/CycleDetail'
Vue.use(Router)

export default new Router({
  mode:'history',
  routes: [
    {path: '/',name: 'Home',component: Home},
    {path: '/CycleAdd',name: 'CycleAdd',component: CycleAdd},
    {path: '/CycleList',name: 'CycleList',component: CycleList},
    {path: '/CycleModify',name: 'CycleModify',component: CycleModify},
    {path: '/CycleDetail',name: 'CycleDetail',component: CycleDetail}
  ]
})
