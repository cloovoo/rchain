# BNFC install for travis
# Ubuntu 14.04 has an outdated BNFC package, so we build BNFC from source
#
# see also: ../.travis.yml, ../scripts/install.sh
sudo apt update
sudo apt -y install haskell-platform
sudo apt -y install jflex 
git clone https://github.com/BNFC/bnfc.git
cd bnfc/source
sudo cabal install --global
