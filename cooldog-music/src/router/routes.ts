const routes=[
  {
    path: '/home',
    name: 'home',
    title: '首页',
    component: import('@/views/home.vue')
  },
    {
        path: '/list',
        name: 'list',
        title: '榜单',
        component: import('@/views/list.vue')
    },
    {
        path: '/listen',
        name: 'listen',
        title: '听书',
        component: import('@/views/home.vue')
    },    {
        path: '/live',
        name: 'live',
        title: '直播',
        component: import('@/views/home.vue')
    },
]
 const rootRoutes = [
  {
    path: '/',
    name: 'layout',
    redirect: '/home',
    component: import('@/components/layout/index.vue'),
    children: routes
  },
]
export { rootRoutes,routes}