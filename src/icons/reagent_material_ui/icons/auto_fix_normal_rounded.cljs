(ns reagent-material-ui.icons.auto-fix-normal-rounded
  "Imports @material-ui/icons/AutoFixNormalRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-fix-normal-rounded (create-svg-icon (e "path" #js {"d" "M20.45 6l.49-1.06L22 4.45c.39-.18.39-.73 0-.91l-1.06-.49L20.45 2c-.18-.39-.73-.39-.91 0l-.49 1.06-1.05.49c-.39.18-.39.73 0 .91l1.06.49.49 1.05c.17.39.73.39.9 0zm-2.74 3.12l-2.83-2.83a.9959.9959 0 0 0-1.41 0L2.29 17.46c-.39.39-.39 1.02 0 1.41l2.83 2.83c.39.39 1.02.39 1.41 0L17.7 10.53c.4-.38.4-1.02.01-1.41zm-3.5 2.09L12.8 9.8l1.38-1.38 1.41 1.41-1.38 1.38z"})
                                              "AutoFixNormalRounded"))