(ns reagent-material-ui.icons.remove-done-outlined
  "Imports @material-ui/icons/RemoveDoneOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def remove-done-outlined (create-svg-icon (e "path" #js {"d" "M4.84 1.98L3.43 3.39l10.38 10.38-1.41 1.41-4.24-4.24-1.41 1.41 5.66 5.66 2.83-2.83 6.6 6.6 1.41-1.41L4.84 1.98zm13.21 10.38L23 7.4 21.57 6l-4.94 4.94 1.42 1.42zm-.71-4.96l-1.41-1.41-2.12 2.12 1.41 1.41 2.12-2.12zM1.08 12.35l5.66 5.66 1.41-1.41-5.66-5.66-1.41 1.41z"})
                                           "RemoveDoneOutlined"))