// org.utils.myUtils

package org.utils

class echoStuff implements Serializable {
    def echoStuff(task) {
        doecho {
          sh "echo ${task}"
        }
    }
}
