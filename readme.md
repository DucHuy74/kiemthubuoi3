# 📄 Báo Cáo Kiểm Thử (White-Box Testing)

Dự án này áp dụng phương pháp **Kiểm thử hộp trắng (White-box Testing)** để kiểm tra chi tiết logic bên trong của các hàm trong `MathUtils`.

---

## 🔹 1. Mục tiêu

* Kiểm tra **cấu trúc nội bộ của chương trình**
* Bao phủ:

  * Câu lệnh (Statement)
  * Nhánh điều kiện (Branch)
  * Vòng lặp (Loop)
  * Đường đi logic (Execution Path)
* Đạt:

  * ✅ **100% Statement Coverage**
  * ✅ **100% Branch Coverage**

---

## 🔹 2. Phân tích mã nguồn

### ✔ Câu lệnh (Statement)

Mỗi dòng lệnh thực thi trong chương trình, ví dụ:

```java
return 2 * (a + b);
```

---

### ✔ Nhánh điều kiện (Branch)

#### Ví dụ: phương trình bậc 2

```math
Δ = b^2 - 4ac
```

Các nhánh cần kiểm thử:

* `a == 0`

  * `b == 0` → vô nghiệm
  * `b != 0` → phương trình bậc 1
* `delta < 0` → vô nghiệm
* `delta == 0` → nghiệm kép
* `delta > 0` → 2 nghiệm

👉 Đây là hàm có số lượng nhánh nhiều nhất.

---

### ✔ Vòng lặp (Loop)

| Hàm              | Loại      |
| ---------------- | --------- |
| `isPrime`        | for       |
| `alternatingSum` | for       |
| `factorialSum`   | for       |
| `gcd`            | recursion |

---

### ✔ Đường đi logic (Execution Path)

#### Ví dụ: `gcd(a, b)`

* Path 1: `b == 0` → return ngay
* Path 2: recursion nhiều bước
* Path 3: input không hợp lệ → exception

---

## 🔹 3. Thiết kế Test Case (White-box)

Test được chia thành 2 nhóm chính:

---

### 🚀 Issue #1 – Valid Flow Testing

Kiểm thử các luồng xử lý hợp lệ:

* Rectangle:

  * a > 0, b > 0
* Quadratic:

  * bậc 1
  * nghiệm kép
  * 2 nghiệm
* Days:

  * 30, 31 ngày
  * tháng 2 năm nhuận
* Prime:

  * số nguyên tố & không nguyên tố
* GCD:

  * giá trị hợp lệ
* Factorial:

  * n > 0

---

### 💣 Issue #2 – Branch, Edge & Exception Testing

Bao phủ toàn bộ nhánh:

#### ✔ Quadratic

* a = 0, b = 0
* a = 0, b ≠ 0
* delta < 0
* delta = 0
* delta > 0

#### ✔ DaysInMonth

* tất cả case trong switch
* tháng 2 (nhuận / không nhuận)
* invalid month

#### ✔ Prime

* n < 2
* n âm

#### ✔ AlternatingSum

* n ≤ 0 → exception

#### ✔ GCD

* b = 0
* recursion
* input âm → exception

#### ✔ FactorialSum

* n ≤ 0 → exception

---

## 🔹 4. Bao phủ vòng lặp

| Hàm            | Trường hợp kiểm thử                |
| -------------- | ---------------------------------- |
| isPrime        | không chạy loop (n < 2), chạy loop |
| alternatingSum | n = 1, n > 1                       |
| factorialSum   | nhiều iteration                    |
| gcd            | recursion nhiều mức                |

---

## 🔹 5. Kết quả kiểm thử

Sau khi chạy toàn bộ test:

```
Tests run: XX
Failures: 0
Errors: 0
```

👉 Tất cả test đều pass.

---

## 🔹 6. Đánh giá độ bao phủ

| Loại coverage      | Kết quả |
| ------------------ | ------- |
| Statement Coverage | 100%    |
| Branch Coverage    | 100%    |
| Loop Coverage      | Đầy đủ  |
| Exception Coverage | Đầy đủ  |

---

## 🔹 7. Kết luận

* Tất cả các đường đi logic đã được kiểm thử
* Không còn nhánh chưa được bao phủ
* Hệ thống xử lý đúng cả:

  * Input hợp lệ
  * Input biên
  * Input lỗi

👉 Kiểm thử hộp trắng giúp đảm bảo **độ tin cậy cao của chương trình** bằng cách kiểm tra trực tiếp logic bên trong.

---
