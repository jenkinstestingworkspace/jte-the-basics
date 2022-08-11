void call(){
    stage("Build: Maven"){
        println "Build Number ${config.BUILD_NUMBER_ENV}"
        println "Prefix Release Version ${config.RELEASE_VERSION_SERIAL_NUMBER_PREFIX}"
    }
}