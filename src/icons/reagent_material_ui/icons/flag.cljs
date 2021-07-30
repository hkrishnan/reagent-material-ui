(ns reagent-material-ui.icons.flag
  "Imports @material-ui/icons/Flag as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flag (create-svg-icon (e "path" #js {"d" "M14.4 6 14 4H5v17h2v-7h5.6l.4 2h7V6z"})
                           "Flag"))
