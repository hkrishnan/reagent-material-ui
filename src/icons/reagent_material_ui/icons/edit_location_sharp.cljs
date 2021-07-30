(ns reagent-material-ui.icons.edit-location-sharp
  "Imports @material-ui/icons/EditLocationSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edit-location-sharp (create-svg-icon (e "path" #js {"d" "M18.11 1.77 19.78.1l2.12 2.12-1.67 1.67-2.12-2.12zm-1 1 2.12 2.12L13.12 11H11V8.89l6.11-6.12zm-1.98-.13L9.5 8.27v4.24h4.24l5.62-5.62c.41.99.64 2.1.64 3.32 0 3.32-2.67 7.25-8 11.8-5.33-4.55-8-8.48-8-11.8 0-4.98 3.8-8.2 8-8.2 1.09 0 2.16.22 3.13.63z"})
                                          "EditLocationSharp"))
