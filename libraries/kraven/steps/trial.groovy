void call(){
    stage("Build: Maven"){
        println "trial from the kraven library ${env.BUILD_NUMBER}"
    }
}