const routes = [
    {
        path: '/home',
        name: 'home',
        title: '首页',
        isHide: false,
        component: import('@/views/home.vue')
    },
    {
        path: '/list',
        name: 'list',
        title: '榜单',
        isHide: false,
        component: import('@/views/list.vue')
    },
    {
        path: '/listen',
        name: 'listen',
        title: '听书',
        isHide: false,
        component: import('@/views/home.vue')
    },
    {
        path: '/live',
        name: 'live',
        title: '直播',
        isHide: false,
        component: import('@/views/home.vue')
    },
    {
        path: '/search',
        name: 'search',
        isHide: true,
        title: 'search',
        component: import('@/views/searchPage.vue')
    },
    {
        path: '/music-info/:name',
        name: 'musicInfo',
        isHide: true,
        title: 'musicInfo',
        component: import('@/views/musicInfo.vue')
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
export {rootRoutes, routes}