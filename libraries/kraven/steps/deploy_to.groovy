void call(app_env){
    stage("Deploy To: ${app_env.short_name}"){
        println "deploying to ${app_env.build_number}"
    }
}