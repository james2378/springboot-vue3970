const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot82f6q/",
            name: "springboot82f6q",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot82f6q/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "职称评审管理系统"
        } 
    }
}
export default base
