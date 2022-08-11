void call(){
    stage("Build: Maven"){
            sh 'echo $config.BUILD_NUMBER_ENV'
    }
}