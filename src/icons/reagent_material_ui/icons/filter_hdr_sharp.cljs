(ns reagent-material-ui.icons.filter-hdr-sharp
  "Imports @material-ui/icons/FilterHdrSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def filter-hdr-sharp (create-svg-icon (e "path" #js {"d" "m14 6-3.75 5 2.85 3.8-1.6 1.2C9.81 13.75 7 10 7 10l-6 8h22L14 6z"})
                                       "FilterHdrSharp"))
