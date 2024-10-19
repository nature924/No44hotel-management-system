
var projectName = '酒店管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '酒店简介',
	url: './pages/jiudianjianjie/list.html'
}, 
{
	name: '酒店客房',
	url: './pages/jiudiankefang/list.html'
}, 

{
	name: '酒店公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootb1g8z/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"员工","menuJump":"列表","tableName":"yuangong"}],"menu":"员工管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["新增","查看","修改","删除"],"menu":"客房类型","menuJump":"列表","tableName":"kefangleixing"}],"menu":"客房类型管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论"],"menu":"酒店简介","menuJump":"列表","tableName":"jiudianjianjie"}],"menu":"酒店简介管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"酒店客房","menuJump":"列表","tableName":"jiudiankefang"}],"menu":"酒店客房管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"客房预定","menuJump":"列表","tableName":"kefangyuding"}],"menu":"客房预定管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"入住安排","menuJump":"列表","tableName":"ruzhuanpai"}],"menu":"入住安排管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"酒店公告","tableName":"news"},{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","查看评论"],"menu":"酒店简介列表","menuJump":"列表","tableName":"jiudianjianjie"}],"menu":"酒店简介模块"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","查看评论","预定"],"menu":"酒店客房列表","menuJump":"列表","tableName":"jiudiankefang"}],"menu":"酒店客房模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"酒店客房","menuJump":"列表","tableName":"jiudiankefang"}],"menu":"酒店客房管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除","入住安排"],"menu":"客房预定","menuJump":"列表","tableName":"kefangyuding"}],"menu":"客房预定管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","删除"],"menu":"入住安排","menuJump":"列表","tableName":"ruzhuanpai"}],"menu":"入住安排管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","查看评论"],"menu":"酒店简介列表","menuJump":"列表","tableName":"jiudianjianjie"}],"menu":"酒店简介模块"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","查看评论","预定"],"menu":"酒店客房列表","menuJump":"列表","tableName":"jiudiankefang"}],"menu":"酒店客房模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"员工","tableName":"yuangong"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除","支付"],"menu":"客房预定","menuJump":"列表","tableName":"kefangyuding"}],"menu":"客房预定管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"入住安排","menuJump":"列表","tableName":"ruzhuanpai"}],"menu":"入住安排管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","查看评论"],"menu":"酒店简介列表","menuJump":"列表","tableName":"jiudianjianjie"}],"menu":"酒店简介模块"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看","查看评论","预定"],"menu":"酒店客房列表","menuJump":"列表","tableName":"jiudiankefang"}],"menu":"酒店客房模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
