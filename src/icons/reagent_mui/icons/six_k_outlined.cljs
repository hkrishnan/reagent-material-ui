(ns reagent-mui.icons.six-k-outlined
  "Imports @mui/icons-material/SixKOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def six-k-outlined (create-svg-icon [(e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M14.5 12.75 16.25 15H18l-2.25-3L18 9h-1.75l-1.75 2.25V9H13v6h1.5zM7.5 15H10c.55 0 1-.45 1-1v-1.5c0-.55-.45-1-1-1H8v-1h3V9H7.5c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1zm.5-2.5h1.5V14H8v-1.5z"})]
                                     "SixKOutlined"))