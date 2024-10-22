FROM mcr.microsoft.com/vscode/devcontainers/base:ubuntu

RUN su vscode -c "umask 0002 && . /usr/local/sdkman/bin/sdkman-init.sh && sdk install maven && sdk install java 21.0.5-amzn";
