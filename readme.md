
## 1. Matrix Strategy

Workflow `.github/workflows/matrix-ci.yml` sử dụng matrix để chạy test trên 3 hệ điều hành:
- `ubuntu-latest`
- `windows-latest`
- `macos-latest`

## 2. Giải pháp

Sử dụng `File.separator` để đảm bảo đường dẫn tương thích mọi hệ điều hành:
```java
return "data" + File.separator + fileName;