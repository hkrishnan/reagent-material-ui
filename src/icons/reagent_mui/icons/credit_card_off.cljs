(ns reagent-mui.icons.credit-card-off
  "Imports @mui/icons-material/CreditCardOff as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def credit-card-off (create-svg-icon (e "path" #js {"d" "M21.9 21.9 2.1 2.1.69 3.51l1.55 1.55c-.15.28-.23.6-.23.94L2 18c0 1.11.89 2 2 2h13.17l3.31 3.31 1.42-1.41zM4 12V8h1.17l4 4H4zm2.83-8H20c1.11 0 2 .89 2 2v12c0 .34-.08.66-.23.94L14.83 12H20V8h-9.17l-4-4z"})
                                      "CreditCardOff"))