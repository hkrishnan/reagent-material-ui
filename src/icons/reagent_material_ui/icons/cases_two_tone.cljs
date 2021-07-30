(ns reagent-material-ui.icons.cases-two-tone
  "Imports @material-ui/icons/CasesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def cases-two-tone (create-svg-icon [(e "path" #js {"d" "M7 7h14v9H7z", "opacity" ".3"}) (e "path" #js {"d" "M3 9H1v11c0 1.11.89 2 2 2h17v-2H3V9z"}) (e "path" #js {"d" "M18 5V3c0-1.1-.9-2-2-2h-4c-1.1 0-2 .9-2 2v2H5v11c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5h-5zm-6-2h4v2h-4V3zm9 13H7V7h14v9z"})]
                                     "CasesTwoTone"))
