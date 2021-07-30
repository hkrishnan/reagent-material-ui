(ns reagent-material-ui.icons.casino-outlined
  "Imports @material-ui/icons/CasinoOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def casino-outlined (create-svg-icon [(e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "circle" #js {"cx" "7.5", "cy" "16.5", "r" "1.5"}) (e "circle" #js {"cx" "7.5", "cy" "7.5", "r" "1.5"}) (e "circle" #js {"cx" "12", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "16.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "7.5", "r" "1.5"})]
                                      "CasinoOutlined"))
