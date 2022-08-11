void call(app_env){
    stage("Deploy To: ${app_env.short_name}"){
        println "performing a deployment through ansible.."
        app_env.ip_addresses.each{ ip ->
            println "deploying to ${ip}"
        }
        if(config.requiresApproval){
            timeout(time: 1, unit: 'MINUTES') {
                input 'Approve the deployment?'
            }
        }
    }
}