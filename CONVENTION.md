# Team 6 Convention
## Indent
* indent 2 space
## Naming
### we use -> CamelCase
* Class, Object, Constant -> upper camel case
* method, values, variable -> lower camel case
* package -> plural lowercase (e.g. models)
* branch -> snake_case (only branch name no path e.g. "feature/")
* PR -> name PR like a branch name
* commit log -> use past tense and tell what was changed in this commit
## Space and Line
* เริ่มเขียน function ไม่ต้องเว้นบรรทัด จะเว้นบรรทัดหลังจาก ประกาศตัวแปร หรือเขียน logic  
* หลังจากประกาศ class ไม่ต้องเว้นบรรทัด แต่ถ้าประกาศตัวแปรที่ field ให้เว้นบรรทัดด้วย  
* เเต่ละบรรทัดไม่ควรเกิน 80 ตัวอักษร
* การประกาศตัวแปรหรือฟังก์ชันมี space ตามหลัง colon เสมอ
* ฟังก์ชันที่ไม่รับ parameter ไม่ต้องเขียนวงเล็บด้านหลัง ยกเว้น function ที่ไม่ return ใส่วงเล็บด้วย
* ไม่ต้องมี semi-colon
* ถ้า parameter ใน constructor ของ class/Object/Trait ไม่ยาวเกินไปให้อยู่ในบรรทัดเดียวกัน เเต่ถ้ายาวเกินไปให้ขึ้นบรรทัดใหม่ด้วย 4 space
* 1 space ก่อน {, } เสมอ
## Version
* เลขตัวแรกจะเพิ่มเมื่อมีการเพิ่ม feature หลัก และปิด Snapshot version นั้นๆ
* เลขตัวที่ 2 จะเปลี่ยนเมื่อมีการแก้ไข feature หรือเพิ่ม feature ที่เกี่ยวข้องแต่ไม่ได้เป็น feature หลัก
* เลขตัวที่ 3 เพิ่มเมื่อมีการแก้ bug
