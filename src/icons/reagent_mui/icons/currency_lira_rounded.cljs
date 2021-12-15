(ns reagent-mui.icons.currency-lira-rounded
  "Imports @mui/icons-material/CurrencyLiraRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def currency-lira-rounded (create-svg-icon (e "path" #js {"d" "m9 15.84-1.47.92c-.67.42-1.53-.06-1.53-.85 0-.34.18-.66.47-.85L9 13.48v-2.36l-1.47.92c-.67.42-1.53-.06-1.53-.85 0-.34.18-.66.47-.85L9 8.76V4c0-.55.45-1 1-1s1 .45 1 1v3.51l2.47-1.55c.67-.42 1.53.06 1.53.85 0 .34-.18.66-.47.85L11 9.87l.01 2.35 2.46-1.54c.67-.42 1.53.06 1.53.85 0 .34-.18.66-.47.85L11 14.59V19c2.47 0 4.52-1.79 4.93-4.15.08-.49.49-.85.98-.85.61 0 1.09.54 1 1.14C17.37 18.46 14.48 21 11 21h-1c-.55 0-1-.45-1-1v-4.16z"})
                                            "CurrencyLiraRounded"))