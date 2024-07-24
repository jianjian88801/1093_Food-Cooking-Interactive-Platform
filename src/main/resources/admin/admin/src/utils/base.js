const base = {
    get() {
        return {
            url : "http://localhost:8080/meishipengrenhudong/",
            name: "meishipengrenhudong",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/meishipengrenhudong/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "美食烹饪互动平台"
        } 
    }
}
export default base
