(ns reagent-mui.icons.quickreply
  "Imports @mui/icons-material/Quickreply as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def quickreply (create-svg-icon [(e "path" #js {"d" "M22 4c0-1.1-.9-2-2-2H4c-1.1 0-1.99.9-1.99 2L2 22l4-4h9v-8h7V4z"}) (e "path" #js {"d" "M22.5 16h-2.2l1.7-4h-5v6h2v5z"})]
                                 "Quickreply"))