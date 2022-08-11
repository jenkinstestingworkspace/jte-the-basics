void call(){
    stage("Build: Maven"){
        script {
            "echo ${config.BUILD_NUMBER_ENV}"
        }
    }
}