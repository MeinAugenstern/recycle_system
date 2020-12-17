import Vue from 'vue'
import Router from 'vue-router'
import Login from '../views/login'
import Index from '../views/index'
import UserLayout from '../views/User/userlayout'
import HisInorder from '../views/User/hisInorder'
import DoingInorder from '../views/User/doingInorder'
import Recycle from '../views/User/recycle'
import AlterInfo from '../views/User/alterinfo'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/',
      name:"主页",
      component: Index,
      redirect:"/login"
    },
    {
      path:'/login',
      name:"登录页面",
      component: Login
    },
    {
      path: '/userlayout',
      component: UserLayout,
      children: [
        {
          path: '/hisinorder',
          component: HisInorder
        },
        {
          path: '/doinginorder',
          component: DoingInorder
        },
        {
          path: '/recycle',
          component: Recycle
        },
        {
          path: '/alterinfo',
          component: AlterInfo
        }
      ]
    }

  ]
})
