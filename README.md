# FizzBizz-project
# مستندات بازی شبیه FizzBuzz

## مقدمه

این پروژه یک بازی ساده مبتنی بر جاوا است که از مسئله کلاسیک FizzBuzz الهام گرفته شده است. بازی به کاربران اجازه می‌دهد تا قوانین سفارشی برای جایگزینی اعداد با کلمات بر اساس بخش‌پذیری تعریف کنند. سپس برنامه این قوانین را روی محدوده مشخصی از اعداد اعمال کرده و نتایج را چاپ می‌کند.

## نحوه بازی

1. **تعداد اعداد را وارد کنید**:
   - بازی با درخواست از کاربر برای وارد کردن تعداد جفت‌های عدد-کلمه شروع می‌شود.

2. **جفت‌های عدد-کلمه را وارد کنید**:
   - برای هر جفت، کاربر یک عدد و کلمه متناظر با آن را وارد می‌کند. این جفت‌ها قوانین بازی را تعریف می‌کنند.

3. **محدوده اعداد را مشخص کنید**:
   - کاربر سپس یک محدوده از اعداد (شروع و پایان) را مشخص می‌کند که بازی روی آن اجرا خواهد شد.

4. **اجرای بازی**:
   - برنامه هر عدد در محدوده مشخص شده را پردازش می‌کند. اگر عدد بر هر یک از اعداد تعریف شده بخش‌پذیر باشد، کلمه متناظر به نتیجه اضافه می‌شود. اگر هیچ قانونی اعمال نشود، خود عدد چاپ می‌شود.

## ساختار کد

### فایل Main.java

- **هدف**: مدیریت ورودی کاربر و هماهنگی اجرای بازی.( کاملا به شکل user-friendly)
- - **متدهای کلیدی**:
  - `main(String[] args)`: نقطه ورود برنامه. ورودی کاربر را جمع‌آوری کرده و متدهای لازم از کلاس `Rules` را فراخوانی می‌کند.

### فایل Rules.java

- **هدف**: مدیریت قوانین بازی و پردازش محدوده اعداد.
- **متدهای کلیدی**:
  - `setStruct(int num, String string)`: جفت‌های عدد-کلمه را در یک نگاشت (Map) ذخیره می‌کند.
  - `FinalResult(int start, int end)`: محدوده اعداد را پردازش کرده و نتایج را بر اساس قوانین تعریف شده چاپ می‌کند.

## مثال نحوه استفاده

1. **ورودی**:
   - تعداد اعداد: ۲
   - جفت‌های عدد-کلمه:
     - ۳, "Fizz"
     - ۵, "Buzz"
   - محدوده: ۱ تا ۱۵

2. **خروجی**:
   ```
   1
   2
   Fizz
   4
   Buzz
   Fizz
   7
   8
   Fizz
   Buzz
   11
   Fizz
   13
   14
   FizzBuzz
   ```

## سفارشی‌سازی

- **افزودن قوانین بیشتر**: می‌توانید با افزایش تعداد و ارائه جفت‌های بیشتر، قوانین بیشتری به بازی اضافه کنید.
- **تغییر محدوده**: مقادیر شروع و پایان را تغییر دهید تا بازی روی محدوده‌های مختلفی از اعداد اجرا شود.

## نتیجه‌گیری

این بازی ساده اما انعطاف‌پذیر، مفاهیم پایه‌ای جاوا مانند حلقه‌ها، شرط‌ها و مجموعه‌ها را نشان می‌دهد. به راحتی می‌توان آن را گسترش داد یا تغییر داد تا قوانین پیچیده‌تر یا ویژگی‌های بیشتری را شامل شود. از بازی کردن و آزمایش پیکربندی‌های مختلف لذت ببرید!
