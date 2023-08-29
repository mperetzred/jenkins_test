import org.cnv.Constants

pipelineJob('hello-world-from-k8s'){
    definition {
        cpsScm {
            scm {
                ScmsUtil.cnvScm delegate
            }
            scriptPath('src/jobs/hello-world-from-k8s/Jenkinsfile')
        }
    }
}
