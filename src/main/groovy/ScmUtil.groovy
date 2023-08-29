package org.cnv

class ScmsUtil {
    static void cnvScm(scmContext, repo_owner="mperetzred", repo_branch="main") {
        scmContext.with {
            git {
                remote {
                    name('origin')
                    url("https://github.com/${repo_owner}/jenkins_test.git")
                }
                branch("${repo_branch}")
                extensions {
                    cleanBeforeCheckout()
                    pruneBranches()
                    cloneOptions {
                        shallow(false)
                        noTags(true)
                    }
                }
            }
        }
    }
}

