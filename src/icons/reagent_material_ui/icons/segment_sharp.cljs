(ns reagent-material-ui.icons.segment-sharp
  "Imports @material-ui/icons/SegmentSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def segment-sharp (create-svg-icon (e "path" #js {"d" "M9 18h12v-2H9v2zM3 6v2h18V6H3zm6 7h12v-2H9v2z"})
                                    "SegmentSharp"))