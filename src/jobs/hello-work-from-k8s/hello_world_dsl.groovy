import org.cnv.Constants
import org.cnv.ScmsUtil

pipelineJob("hello-world-from-k8s-${Constants.VERSION}"){
    definition {
        cpsScm {
            scm {
                ScmsUtil.cnvScm delegate
            }
            scriptPath('src/jobs/hello-world-from-k8s/Jenkinsfile')
        }
    }
}
