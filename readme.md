# RUN
```shell
cd docker
```
```shell
docker compose up -d
```

# TEST
```shell
sudo apt install redis-tools
```
```shell
redis-cli -h localhost -p 6379
```
```shell
config get databases
```
```shell
info
```

src/test/test.http

# STOP
```shell
docker compose down
```