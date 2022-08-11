void call(){
    stage("Tester: Test"){
        println "Test Variable ${config.BRANCH_NAME}"
    }
}