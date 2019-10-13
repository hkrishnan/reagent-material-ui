(ns reagent-material-ui.icons.view-module-sharp
  "Imports @material-ui/icons/ViewModuleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-module-sharp (create-svg-icon (e "path" #js {"d" "M4 11h5V5H4v6zm0 7h5v-6H4v6zm6 0h5v-6h-5v6zm6 0h5v-6h-5v6zm-6-7h5V5h-5v6zm6-6v6h5V5h-5z"})
                                        "ViewModuleSharp"))