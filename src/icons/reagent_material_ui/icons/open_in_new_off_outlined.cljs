(ns reagent-material-ui.icons.open-in-new-off-outlined
  "Imports @material-ui/icons/OpenInNewOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def open-in-new-off-outlined (create-svg-icon (e "path" #js {"d" "M16.79 5.8L14 3h7v7l-2.79-2.8-4.09 4.09-1.41-1.41 4.08-4.08zM19 12v4.17l2 2V12h-2zm.78 10.61L18.17 21H5c-1.11 0-2-.9-2-2V5.83L1.39 4.22 2.8 2.81l18.38 18.38-1.4 1.42zM16.17 19l-4.88-4.88-1.59 1.59-1.41-1.41 1.59-1.59L5 7.83V19h11.17zM7.83 5H12V3H5.83l2 2z"})
                                               "OpenInNewOffOutlined"))