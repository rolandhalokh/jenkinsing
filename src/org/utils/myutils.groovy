// org.utils.myUtils

package org.utils

def echoStuff(task) {
   doecho {
      sh "echo ${task}"
   }
}
