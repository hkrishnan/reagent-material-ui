(ns reagent-mui.icons.table-bar-two-tone
  "Imports @mui/icons-material/TableBarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def table-bar-two-tone (create-svg-icon [(e "ellipse" #js {"cx" "12", "cy" "7.5", "opacity" ".3", "rx" "7.72", "ry" "1.5"}) (e "path" #js {"d" "M22 7.5C22 5.57 17.52 4 12 4S2 5.57 2 7.5c0 1.81 3.95 3.31 9 3.48V15H9.35c-.82 0-1.55.5-1.86 1.26L6 20h2l1.2-3h5.6l1.2 3h2l-1.5-3.74c-.3-.76-1.04-1.26-1.85-1.26H13v-4.02c5.05-.17 9-1.67 9-3.48zM12 9c-4.05 0-6.74-.86-7.72-1.5C5.26 6.86 7.95 6 12 6s6.74.86 7.72 1.5C18.74 8.14 16.05 9 12 9z"})]
                                         "TableBarTwoTone"))