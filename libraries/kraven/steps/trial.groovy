void call(){
    stage('Example') {
        if (env.BRANCH_NAME == 'master') {
            echo 'I only execute on the master branch'
        } else {
            echo "I execute elsewhere $env.BRANCH_NAME"
        }
    }
}